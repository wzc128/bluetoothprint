package com.sf.sf_hwd;

import android.app.ActionBar;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.qr.PrintPP_CPCL;
import com.qr.QiRuiCommand;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    private String url = "https://hda-miniarch.sf-express.com/api/";
    private ImageView mBack;
    private TextView mJijianrenName;
    private TextView mJijianrenPhone;
    private TextView mJijianrenAddress;
    private TextView mShoujianrenName;
    private TextView mShoujianrenPhone;
    private TextView mShoujianrenAddress;
    private TextView mWaixiang;
    private TextView mWaixianghao;
    private TextView mPici;
    private TextView mPicihao;
    private View mView1;
    private Button mDayin;
    private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final int REQUEST_ENABLE_BT = 2;
    private BluetoothAdapter mBluetoothAdapter = null;
    private PrintPP_CPCL printPP_cpcl;
    /**
     * 信息
     */
    private TextView mInfo;

    private void initView() {
        mBack = (ImageView) findViewById(R.id.back);
        mJijianrenName = (TextView) findViewById(R.id.jijianren_name);
        mJijianrenPhone = (TextView) findViewById(R.id.jijianren_phone);
        mJijianrenAddress = (TextView) findViewById(R.id.jijianren_address);
        mShoujianrenName = (TextView) findViewById(R.id.shoujianren_name);
        mShoujianrenPhone = (TextView) findViewById(R.id.shoujianren_phone);
        mShoujianrenAddress = (TextView) findViewById(R.id.shoujianren_address);
        mWaixiang = (TextView) findViewById(R.id.waixiang);
        mWaixianghao = (TextView) findViewById(R.id.waixianghao);
        mPici = (TextView) findViewById(R.id.pici);
        mPicihao = (TextView) findViewById(R.id.picihao);
        mView1 = (View) findViewById(R.id.view1);
        mDayin = (Button) findViewById(R.id.dayin);
        mDayin.setOnClickListener(this);
        mBack.setOnClickListener(this);
        mInfo = (TextView) findViewById(R.id.info);
    }


    private static final String TAG = "MainActivity";
    private static final boolean D = true;
    private boolean isConnected = false;
    private String address = "";
    private String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        ActionBar actionBar = getSupportActionBar();
//        ActionBar actionBar = getActionBar();
//        actionBar.hide();
        setContentView(R.layout.activity_main);
        initView();
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            Toast.makeText(this, "该设备蓝牙不可用", Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        Intent serverIntent = new Intent(this, DeviceListActivity.class);
        startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE);

        printPP_cpcl = new PrintPP_CPCL();


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (D) {
            Log.d(TAG, "onActivityResult " + resultCode);
        }

        switch (requestCode) {
            case REQUEST_CONNECT_DEVICE:
                if (resultCode == Activity.RESULT_OK) {
                    if (isConnected & (printPP_cpcl != null)) {
                        printPP_cpcl.disconnect();
                        isConnected = false;
                    }
                    String sdata = data.getExtras()
                            .getString(DeviceListActivity.EXTRA_DEVICE_ADDRESS);
                    address = sdata.substring(sdata.length() - 17);
                    name = sdata.substring(0, (sdata.length() - 17));
                    if (!isConnected) {
                        if (printPP_cpcl.connect(name, address)) {
                            isConnected = true;
                            mInfo.setText("蓝牙地址"+address);
                            mInfo.setText("蓝牙名称"+name);

                        } else {
                            mInfo.setText("连接失败");
                            isConnected = false;
                        }
                    }

                }
                break;
            case REQUEST_ENABLE_BT:

        }
    }


    private void ensureDiscoverable() {
        if (D) {
            Log.d(TAG, "ensure discoverable");
        }
        if (mBluetoothAdapter.getScanMode() !=
                BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
            Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
            startActivity(discoverableIntent);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        // If BT is not on, request that it be enabled
        // setupChat() will then be called during onActivityRe//sultsetupChat
        if (!mBluetoothAdapter.isEnabled()) {
            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.dayin:
                print();
//                printebmpData();
                break;
            case R.id.back:
                finish();
                break;
        }
    }

    public boolean openBlueTooth() {
        if (BlueToothUtil.isBluetoothSupported()) {
            return BlueToothUtil.turnOnBluetooth();
        } else Toast.makeText(this, "该设备不支持蓝牙", Toast.LENGTH_SHORT).show();
        return false;
    }


//    public void printebmpData() {
//        if (isConnected) {
//
//            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test);
//
//            ArrayList<byte[]> data = new ArrayList<byte[]>();
//            byte[] wakeup = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
//            QiRuiCommand printer = new QiRuiCommand();
//            data.add(wakeup);
//            data.add(printer.QiRui_CreatePage(100, 175));
//            // Set print direction
//            data.add(printer.QiRui_Direction(0, 0));
//            // The knife can be cut at first and finished with an automatic paper cutting
//            data.add(printer.QiRui_Cut(true));
//            // Set slot positioning
//            data.add(printer.QiRui_SetGap(true));
//            // set speed 3
//            data.add(printer.QiRui_Speed(6));
//            // Set concentration
//            data.add(printer.QiRui_Density(5));
//            // Clear page buffer
//            data.add(printer.QiRui_Cls());
//
//            data.add(printer.QiRui_DrawPic(10, 10, bitmap));
//            data.add(printer.QiRui_PrintPage(1));
//            printPP_cpcl.portSendCmd(data);
//
//        }
//    }

    private String theAddress = "上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市上海市";

    public void print() {
        if (isConnected) {
            ArrayList<byte[]> data = new ArrayList<byte[]>();
            byte[] wakeup = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
            QiRuiCommand printer = new QiRuiCommand();
            data.add(wakeup);
            data.add(printer.QiRui_CreatePage(100, 150));
            // Set print direction
            data.add(printer.QiRui_Direction(0, 0));
            //The knife can be cut at first and finished with an automatic paper cutting
            data.add(printer.QiRui_Cut(true));
            // Set slot positioning
            data.add(printer.QiRui_SetGap(true));
            //  set speed 3
            data.add(printer.QiRui_Speed(6));
            // Set concentration
            data.add(printer.QiRui_Density(5));
            //  Clear page buffer
            data.add(printer.QiRui_Cls());
            data.add(printer.QiRui_Text(40, 104, "TSS16.BF2", 0, 1, 1, true,
                    "1/5"));
            data.add(printer.QiRui_Text(80, 176, "TSS16.BF2", 0, 1, 1, true,
                    "子单号"));
            data.add(printer.QiRui_Text(80, 208, "TSS16.BF2", 0, 1, 1, true,
                    "母单号"));
            data.add(printer.QiRui_Text(408, 808, "TSS16.BF2", 0, 1, 1, true,
                    "运单号"));
            data.add(printer.QiRui_Text(152, 200, "TSS24.BF2", 0, 1, 1, true,
                    "母单号123123123")); //母单号
            data.add(printer.QiRui_Text(544, 128, "TSS32.BF2", 0, 1, 1, true,
                    "顺丰标快"));
            data.add(printer.QiRui_Text(48, 240, "TSS16.BF2", 0, 1, 1, true,
                    "目"));
            data.add(printer.QiRui_Text(48, 264, "TSS16.BF2", 0, 1, 1, true,
                    "的"));
            data.add(printer.QiRui_Text(48, 288, "TSS16.BF2", 0, 1, 1, true,
                    "地"));
            data.add(printer.QiRui_Text(88, 240, "TSS32.BF2", 0, 2, 2, true,
                   "目的地TTE")); //目的地
            data.add(printer.QiRui_Text(48, 336, "TSS16.BF2", 0, 1, 1, true,
                    "收"));
            data.add(printer.QiRui_Text(48, 360, "TSS16.BF2", 0, 1, 1, true,
                    "件"));
            data.add(printer.QiRui_Text(48, 384, "TSS16.BF2", 0, 1, 1, true,
                    "人"));

            if (address.length() > 26) {
                data.add(printer.QiRui_Text(88, 328, "TSS16.BF2", 0, 1, 1, true,
                        "收件人" + ' ' +
                                "18812345678" + ' ' +
                                "xxxx公司"));
                data.add(printer.QiRui_Text(88, 352, "TSS16.BF2", 0, 1, 1, true,
                        theAddress.substring(0, 26)));
                data.add(printer.QiRui_Text(88, 376, "TSS16.BF2", 0, 1, 1, true,
                        theAddress.substring(26)));
            } else {
                data.add(printer.QiRui_Text(88, 336, "TSS24.BF2", 0, 1, 1, true,
                        "收件人" + ' ' +
                                "18812345678" + ' ' +
                                "xxxx公司"));
                data.add(printer.QiRui_Text(88, 368, "TSS24.BF2", 0, 1, 1, true,
                        theAddress));
            }

            data.add(printer.QiRui_Text(48, 952, "TSS16.BF2", 0, 1, 1, true,
                    "收"));
            data.add(printer.QiRui_Text(48, 968, "TSS16.BF2", 0, 1, 1, true,
                    "件"));
            data.add(printer.QiRui_Text(48, 992, "TSS16.BF2", 0, 1, 1, true,
                    "人"));
            if (address.length() > 26) {
                data.add(printer.QiRui_Text(88, 944, "TSS16.BF2", 0, 1, 1, true,
                        "收件人" + ' ' +
                                "18812345678" + ' ' +
                                "xxxx公司"));
                data.add(printer.QiRui_Text(88, 968, "TSS16.BF2", 0, 1, 1, true,
                        theAddress.substring(0, 26)));
                data.add(printer.QiRui_Text(88, 992, "TSS16.BF2", 0, 1, 1, true,
                        theAddress.substring(26)));
            } else {
                data.add(printer.QiRui_Text(88, 944, "TSS24.BF2", 0, 1, 1, true,
                        "收件人" + ' ' +
                                "18812345678" + ' ' +
                                "xxxx公司"));
                data.add(printer.QiRui_Text(88, 976, "TSS24.BF2", 0, 1, 1, true,
                        theAddress));
            }


            data.add(printer.QiRui_Text(48, 432, "TSS16.BF2", 0, 1, 1, true,
                    "寄"));
            data.add(printer.QiRui_Text(48, 456, "TSS16.BF2", 0, 1, 1, true,
                    "件"));
            data.add(printer.QiRui_Text(48, 480, "TSS16.BF2", 0, 1, 1, true,
                    "人"));
            data.add(printer.QiRui_Text(88, 424, "TSS16.BF2", 0, 1, 1, true,
                    "寄件人" + ' ' +
                            "18812345678" + ' ' +
                            "xxxx公司")); //寄件人
            data.add(printer.QiRui_Text(88, 448, "TSS16.BF2", 0, 1, 1, true,
                    "上海市 上海市")); //寄件人
            data.add(printer.QiRui_Text(88, 472, "TSS16.BF2", 0, 1, 1, true,
                   "是撒额发违反啊额我发i俄军发")); //寄件人

            data.add(printer.QiRui_Text(48, 856, "TSS16.BF2", 0, 1, 1, true,
                    "寄"));
            data.add(printer.QiRui_Text(48, 880, "TSS16.BF2", 0, 1, 1, true,
                    "件"));
            data.add(printer.QiRui_Text(48, 904, "TSS16.BF2", 0, 1, 1, true,
                    "人"));
            data.add(printer.QiRui_Text(88, 856, "TSS16.BF2", 0, 1, 1, true,
                    "寄件人" + ' ' +
                            "18812345678" + ' ' +
                            "xxxx公司")); //寄件人
            data.add(printer.QiRui_Text(88, 880, "TSS16.BF2", 0, 1, 1, true,
                    "上海市 上海市")); //寄件人
            data.add(printer.QiRui_Text(88, 904, "TSS16.BF2", 0, 1, 1, true,
                   "是撒额发违反啊额我发i俄军发")); //寄件人
            String payMethod = "寄方付"; //1:寄方付 2:收方付 3:第三方付
            data.add(printer.QiRui_Text(40, 512, "TSS16.BF2", 0, 1, 1, true,
                    "付款方式:" + payMethod));
            data.add(printer.QiRui_Text(40, 544, "TSS16.BF2", 0, 1, 1, true,
                    "月结卡号:" + "123231231"));

            data.add(printer.QiRui_Text(48, 624, "TSS16.BF2", 0, 1, 1, true,
                    "托"));
            data.add(printer.QiRui_Text(48, 640, "TSS16.BF2", 0, 1, 1, true,
                    "寄"));
            data.add(printer.QiRui_Text(48, 656, "TSS16.BF2", 0, 1, 1, true,
                    "物"));
            data.add(printer.QiRui_Text(88, 640, "TSS16.BF2", 0, 1, 1, true,
                    "监控器材")); //托寄物

            data.add(printer.QiRui_Text(528, 616, "TSS16.BF2", 0, 1, 1, true,
                    "收方签署"));
            data.add(printer.QiRui_Text(600, 696, "TSS16.BF2", 0, 1, 1, true,
                    "日期:"));
            data.add(printer.QiRui_Text(672, 696, "TSS16.BF2", 0, 1, 1, true,
                    "年"));
            data.add(printer.QiRui_Text(720, 696, "TSS16.BF2", 0, 1, 1, true,
                    "月"));
            data.add(printer.QiRui_DrawBox(32, 80, 768, 1040, 3, 0));
            data.add(printer.QiRui_DrawLine(32, 224, 768, 224, 3, 0)); //x-条形码
            data.add(printer.QiRui_DrawLine(32, 840, 768, 840, 3, 0)); //x-条形码
            data.add(printer.QiRui_DrawLine(512, 80, 512, 224, 3, 0)); //x-条形码-中间分割线
            data.add(printer.QiRui_DrawLine(368, 720, 368, 840, 3, 0)); //x-条形码-中间分割线

            data.add(printer.QiRui_DrawLine(80, 224, 80, 320, 3, 0)); //目的地竖线
            data.add(printer.QiRui_DrawLine(32, 320, 768, 320, 3, 0)); //目的地下划线

            data.add(printer.QiRui_DrawLine(80, 320, 80, 416, 3, 0)); //收件人竖线
            data.add(printer.QiRui_DrawLine(80, 936, 80, 1032, 3, 0)); //收件人竖线
            data.add(printer.QiRui_DrawLine(32, 416, 768, 416, 3, 0)); //收件人下划线
            data.add(printer.QiRui_DrawLine(80, 416, 80, 496, 3, 0)); //寄件人竖线
            data.add(printer.QiRui_DrawLine(80, 840, 80, 936, 3, 0)); //寄件人竖线
            data.add(printer.QiRui_DrawLine(32, 496, 768, 496, 3, 0)); //寄件人下划线
            data.add(printer.QiRui_DrawLine(32, 936, 768, 936, 3, 0)); //寄件人下划线
            data.add(printer.QiRui_DrawLine(32, 600, 768, 600, 3, 0)); //付款方式
            data.add(printer.QiRui_DrawLine(520, 600, 520, 720, 3, 0)); //托寄物竖线
            data.add(printer.QiRui_DrawLine(32, 720, 768, 720, 3, 0)); //托寄物
            data.add(printer.QiRui_DrawLine(80, 600, 80, 720, 3, 0)); //托寄物竖线1

            data.add(printer.QiRui_DrawBar(96, 96, 0, 70, 2, 0, 3, "123456548945"));
            data.add(printer.QiRui_DrawBar(400, 728, 0, 70, 2, 0, 3, "22222456548945"));
            data.add(printer.QiRui_PrintPage(1));
            printPP_cpcl.portSendCmd(data);
        }
    }
    public void printecommendData() {
        if (isConnected) {
            ArrayList<byte[]> data = new ArrayList<byte[]>();
            byte[] wakeup = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
            QiRuiCommand printer = new QiRuiCommand();
            data.add(wakeup);
            data.add(printer.QiRui_CreatePage(100, 150));
            // Set print direction
            data.add(printer.QiRui_Direction(0, 0));
            //The knife can be cut at first and finished with an automatic paper cutting
            data.add(printer.QiRui_Cut(true));
            // Set slot positioning
            data.add(printer.QiRui_SetGap(true));
            //  set speed 3
            data.add(printer.QiRui_Speed(6));
            // Set concentration
            data.add(printer.QiRui_Density(5));
            //  Clear page buffer
            data.add(printer.QiRui_Cls());

            // draw 线
            data.add(printer.QiRui_DrawLine(300, 10, 4, 90, 0));
            data.add(printer.QiRui_DrawLine(320, 420, 600, 700, 5, 0));

            data.add(printer.QiRui_DrawLine(320, 780, 600, 460, 8, 3));

            data.add(printer.QiRui_Text(30, 120, "TSS24.BF2", 0, 1, 1, true, "发  件  人：张三 (电话 874236021)"));

            data.add(printer.QiRui_Textbox(30, 800, "TSS24.BF2", 0, 1, 1, 700, 24, "万琛电子根据物流行业对电子面单打印机的需求，推出全新的电子面单打印机—启锐电子面单打印机，针对物流行业对电子面单的高标准，该机型做了大量的调整和创新，推出了现行同规格电子面单打印机没有的全新功能，同时也对现有打印机存在的问题进行了转向改进。"));

            data.add(printer.QiRui_DrawLine(30, 100, 740, 4, 0));
            data.add(printer.QiRui_DrawLine(30, 880, 740, 4, 0));
            data.add(printer.QiRui_DrawLine(30, 1300, 740, 4, 0));

            // print 文字
            data.add(printer.QiRui_Text(400, 25, "TSS24.BF2", 0, 3, 3, "上海浦东"));
            data.add(printer.QiRui_Text(30, 120, "TSS24.BF2", 0, 1, 1, "发  件  人：张三 (电话 874236021)"));
            data.add(printer.QiRui_Text(30, 150, "TSS24.BF2", 0, 1, 1, "发件人地址：广州省 深圳市 福田区 思创路123号\"工业园\"1栋2楼"));
            data.add(printer.QiRui_Text(30, 200, "TSS24.BF2", 0, 1, 1, "收  件  人：李四 (电话 13899658435)"));
            data.add(printer.QiRui_Text(30, 230, "TSS24.BF2", 0, 1, 1, "收件人地址：上海市 浦东区 太仓路司务小区9栋1105室"));

            data.add(printer.QiRui_Text(30, 700, "TSS16.BF2", 0, 1, 1, "各类邮件禁寄、限寄的范围，除上述规定外，还应参阅“中华人民共和国海关对"));
            data.add(printer.QiRui_Text(30, 720, "TSS16.BF2", 0, 1, 1, "进出口邮递物品监管办法”和国家法令有关禁止和限制邮寄物品的规定，以及邮"));
            data.add(printer.QiRui_Text(30, 740, "TSS16.BF2", 0, 1, 1, "寄物品的规定，以及邮电部转发的各国（地区）邮 政禁止和限制。"));
            data.add(printer.QiRui_Text(30, 760, "TSS16.BF2", 0, 1, 1, "寄件人承诺不含有法律规定的违禁物品。"));

            // print 条形码
            data.add(printer.QiRui_DrawBar(80, 300, 0, 90, 2, 0, 4, "873456093465"));
            data.add(printer.QiRui_DrawBar(550, 910, 0, 50, 2, 0, 2, "873456093465"));

            // Draw 框子
            data.add(printer.QiRui_DrawBox(40, 500, 340, 650, 4, 20));

            data.add(printer.QiRui_Text(60, 520, "TSS24.BF2", 0, 1, 1, "寄件人签字："));
            data.add(printer.QiRui_Text(130, 625, "TSS24.BF2", 0, 1, 1, "2015-10-30 09:09"));
            data.add(printer.QiRui_Text(50, 1000, "TSS32.BF2", 0, 2, 3, "广东 ---- 上海浦东"));

//            // Draw 圆圈
//            data.add(printer.QiRui_DrawCircle(700, 1200, 50, 6));
//
//            data.add(printer.QiRui_Text(670, 1170, "TSS24.BF2", 0, 3, 3, "碎"));
//
//            // print 二维码
//            data.add(printer.QiRui_DrawQRCode(620, 620, 3, 0, 4, "www.qrprt.com   www.qrprt.com   www.qrprt.com"));
//
//            // print 数据矩阵
//            data.add(printer.QiRui_DrawDataMatrix(100, 1300, 400, 400, "www.qrprt.com"));

            // send print command ,print label
            data.add(printer.QiRui_PrintPage(1));
            printPP_cpcl.portSendCmd(data);

        }
    }
}
