package com.sf.sf_hwd;

public class OrderDetailData {

    /**
     * code : 0
     * message : 操作成功
     * success : true
     * data : {"totalNum":2,"notPrintNum":0,"orderId":"HIK001935119220180724230515","returnTracking":"217038606886","jaddress":"滨江区东流路700号","dmobile":"","jtel":"DEEQAVTsl5JnWtZND2ZviKKY9RWlE%3D","daddress":"浙江丽水市遂昌县庙高街道古院区块人民防空办公室大楼4楼 有电梯","dcontact":"柳胜 17681957113","jmobile":"","jcontact":"蔡平","dtel":"DEEQAVTnni3%2Fb%2FRLPXkcmisGn1wTw%3D"}
     */

    private String code;
    private String message;
    private boolean success;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * totalNum : 2
         * notPrintNum : 0
         * orderId : HIK001935119220180724230515
         * returnTracking : 217038606886
         * jaddress : 滨江区东流路700号
         * dmobile :
         * jtel : DEEQAVTsl5JnWtZND2ZviKKY9RWlE%3D
         * daddress : 浙江丽水市遂昌县庙高街道古院区块人民防空办公室大楼4楼 有电梯
         * dcontact : 柳胜 17681957113
         * jmobile :
         * jcontact : 蔡平
         * dtel : DEEQAVTnni3%2Fb%2FRLPXkcmisGn1wTw%3D
         */

        private int totalNum;
        private int notPrintNum;
        private String orderId;
        private String returnTracking;
        private String jaddress;
        private String dmobile;
        private String jtel;
        private String daddress;
        private String dcontact;
        private String jmobile;
        private String jcontact;
        private String dtel;

        public int getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
        }

        public int getNotPrintNum() {
            return notPrintNum;
        }

        public void setNotPrintNum(int notPrintNum) {
            this.notPrintNum = notPrintNum;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getReturnTracking() {
            return returnTracking;
        }

        public void setReturnTracking(String returnTracking) {
            this.returnTracking = returnTracking;
        }

        public String getJaddress() {
            return jaddress;
        }

        public void setJaddress(String jaddress) {
            this.jaddress = jaddress;
        }

        public String getDmobile() {
            return dmobile;
        }

        public void setDmobile(String dmobile) {
            this.dmobile = dmobile;
        }

        public String getJtel() {
            return jtel;
        }

        public void setJtel(String jtel) {
            this.jtel = jtel;
        }

        public String getDaddress() {
            return daddress;
        }

        public void setDaddress(String daddress) {
            this.daddress = daddress;
        }

        public String getDcontact() {
            return dcontact;
        }

        public void setDcontact(String dcontact) {
            this.dcontact = dcontact;
        }

        public String getJmobile() {
            return jmobile;
        }

        public void setJmobile(String jmobile) {
            this.jmobile = jmobile;
        }

        public String getJcontact() {
            return jcontact;
        }

        public void setJcontact(String jcontact) {
            this.jcontact = jcontact;
        }

        public String getDtel() {
            return dtel;
        }

        public void setDtel(String dtel) {
            this.dtel = dtel;
        }
    }
}
