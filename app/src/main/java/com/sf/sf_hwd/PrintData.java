package com.sf.sf_hwd;

import java.util.List;

public class PrintData {


    /**
     * code : 0
     * message : 操作成功
     * success : true
     * data : {"mailno":"848445883340","rate":"2/2","notPrintNum":0,"flowno":null,"currentNum":2,"parentMailno":"767664238058","orderDetailVO":{"orderId":"HIK001935119220180724230515","custId":"5712188028","taxPayType":"","goodsCode":null,"payMethod":1,"parcelQuantity":2,"expressType":"1","cargo":"监控器材","cargoCount":"","cargoTolWeight":"5.0","cargoWeight":"","cargoAmount":"","cargoUnit":"","goodsTotalWeight":"","isDocall":null,"needReturnTrackingNo":1,"returnTracking":"217038606886","orderName":"","orderCertType":"","orderCertNo":"","insAmount":"","isGenbillNo":null,"insureFee":"","orderCargoList":[{"cargo":"监控器材","cargoCount":"","cargoTolWeight":null,"cargoWeight":null,"cargoAmount":null,"cargoUnit":""}],"jaddress":"滨江区东流路700号","dmobile":"","jtel":"DEEQAVTsl5JnWtZND2ZviKKY9RWlE%3D","daddress":"浙江丽水市遂昌县庙高街道古院区块人民防空办公室大楼4楼 有电梯","dcontact":"柳胜 17681957113","jmobile":"","jcontact":"蔡平","dtel":"DEEQAVTnni3%2Fb%2FRLPXkcmisGn1wTw%3D","jcityName":"杭州市","jpostalCode":"","dcountry":"","jcountry":"","jprovince":"浙江省","jcounty":"桐庐县","jcompany":"海康威视","dprovince":"浙江","dcityName":"丽水市","dpostalCode":"","jshippercode":"571CFE","dcompany":"*","ddeliverycode":"578","dcounty":"遂昌县"},"returnTracking":null}
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
         * mailno : 848445883340
         * rate : 2/2
         * notPrintNum : 0
         * flowno : null
         * currentNum : 2
         * parentMailno : 767664238058
         * orderDetailVO : {"orderId":"HIK001935119220180724230515","custId":"5712188028","taxPayType":"","goodsCode":null,"payMethod":1,"parcelQuantity":2,"expressType":"1","cargo":"监控器材","cargoCount":"","cargoTolWeight":"5.0","cargoWeight":"","cargoAmount":"","cargoUnit":"","goodsTotalWeight":"","isDocall":null,"needReturnTrackingNo":1,"returnTracking":"217038606886","orderName":"","orderCertType":"","orderCertNo":"","insAmount":"","isGenbillNo":null,"insureFee":"","orderCargoList":[{"cargo":"监控器材","cargoCount":"","cargoTolWeight":null,"cargoWeight":null,"cargoAmount":null,"cargoUnit":""}],"jaddress":"滨江区东流路700号","dmobile":"","jtel":"DEEQAVTsl5JnWtZND2ZviKKY9RWlE%3D","daddress":"浙江丽水市遂昌县庙高街道古院区块人民防空办公室大楼4楼 有电梯","dcontact":"柳胜 17681957113","jmobile":"","jcontact":"蔡平","dtel":"DEEQAVTnni3%2Fb%2FRLPXkcmisGn1wTw%3D","jcityName":"杭州市","jpostalCode":"","dcountry":"","jcountry":"","jprovince":"浙江省","jcounty":"桐庐县","jcompany":"海康威视","dprovince":"浙江","dcityName":"丽水市","dpostalCode":"","jshippercode":"571CFE","dcompany":"*","ddeliverycode":"578","dcounty":"遂昌县"}
         * returnTracking : null
         */

        private String mailno;
        private String rate;
        private int notPrintNum;
        private Object flowno;
        private int currentNum;
        private String parentMailno;
        private OrderDetailVOBean orderDetailVO;
        private Object returnTracking;

        public String getMailno() {
            return mailno;
        }

        public void setMailno(String mailno) {
            this.mailno = mailno;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public int getNotPrintNum() {
            return notPrintNum;
        }

        public void setNotPrintNum(int notPrintNum) {
            this.notPrintNum = notPrintNum;
        }

        public Object getFlowno() {
            return flowno;
        }

        public void setFlowno(Object flowno) {
            this.flowno = flowno;
        }

        public int getCurrentNum() {
            return currentNum;
        }

        public void setCurrentNum(int currentNum) {
            this.currentNum = currentNum;
        }

        public String getParentMailno() {
            return parentMailno;
        }

        public void setParentMailno(String parentMailno) {
            this.parentMailno = parentMailno;
        }

        public OrderDetailVOBean getOrderDetailVO() {
            return orderDetailVO;
        }

        public void setOrderDetailVO(OrderDetailVOBean orderDetailVO) {
            this.orderDetailVO = orderDetailVO;
        }

        public Object getReturnTracking() {
            return returnTracking;
        }

        public void setReturnTracking(Object returnTracking) {
            this.returnTracking = returnTracking;
        }

        public static class OrderDetailVOBean {
            /**
             * orderId : HIK001935119220180724230515
             * custId : 5712188028
             * taxPayType :
             * goodsCode : null
             * payMethod : 1
             * parcelQuantity : 2
             * expressType : 1
             * cargo : 监控器材
             * cargoCount :
             * cargoTolWeight : 5.0
             * cargoWeight :
             * cargoAmount :
             * cargoUnit :
             * goodsTotalWeight :
             * isDocall : null
             * needReturnTrackingNo : 1
             * returnTracking : 217038606886
             * orderName :
             * orderCertType :
             * orderCertNo :
             * insAmount :
             * isGenbillNo : null
             * insureFee :
             * orderCargoList : [{"cargo":"监控器材","cargoCount":"","cargoTolWeight":null,"cargoWeight":null,"cargoAmount":null,"cargoUnit":""}]
             * jaddress : 滨江区东流路700号
             * dmobile :
             * jtel : DEEQAVTsl5JnWtZND2ZviKKY9RWlE%3D
             * daddress : 浙江丽水市遂昌县庙高街道古院区块人民防空办公室大楼4楼 有电梯
             * dcontact : 柳胜 17681957113
             * jmobile :
             * jcontact : 蔡平
             * dtel : DEEQAVTnni3%2Fb%2FRLPXkcmisGn1wTw%3D
             * jcityName : 杭州市
             * jpostalCode :
             * dcountry :
             * jcountry :
             * jprovince : 浙江省
             * jcounty : 桐庐县
             * jcompany : 海康威视
             * dprovince : 浙江
             * dcityName : 丽水市
             * dpostalCode :
             * jshippercode : 571CFE
             * dcompany : *
             * ddeliverycode : 578
             * dcounty : 遂昌县
             */

            private String orderId;
            private String custId;
            private String taxPayType;
            private Object goodsCode;
            private int payMethod;
            private int parcelQuantity;
            private String expressType;
            private String cargo;
            private String cargoCount;
            private String cargoTolWeight;
            private String cargoWeight;
            private String cargoAmount;
            private String cargoUnit;
            private String goodsTotalWeight;
            private Object isDocall;
            private int needReturnTrackingNo;
            private String returnTracking;
            private String orderName;
            private String orderCertType;
            private String orderCertNo;
            private String insAmount;
            private Object isGenbillNo;
            private String insureFee;
            private String jaddress;
            private String dmobile;
            private String jtel;
            private String daddress;
            private String dcontact;
            private String jmobile;
            private String jcontact;
            private String dtel;
            private String jcityName;
            private String jpostalCode;
            private String dcountry;
            private String jcountry;
            private String jprovince;
            private String jcounty;
            private String jcompany;
            private String dprovince;
            private String dcityName;
            private String dpostalCode;
            private String jshippercode;
            private String dcompany;
            private String ddeliverycode;
            private String dcounty;
            private List<OrderCargoListBean> orderCargoList;

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getCustId() {
                return custId;
            }

            public void setCustId(String custId) {
                this.custId = custId;
            }

            public String getTaxPayType() {
                return taxPayType;
            }

            public void setTaxPayType(String taxPayType) {
                this.taxPayType = taxPayType;
            }

            public Object getGoodsCode() {
                return goodsCode;
            }

            public void setGoodsCode(Object goodsCode) {
                this.goodsCode = goodsCode;
            }

            public int getPayMethod() {
                return payMethod;
            }

            public void setPayMethod(int payMethod) {
                this.payMethod = payMethod;
            }

            public int getParcelQuantity() {
                return parcelQuantity;
            }

            public void setParcelQuantity(int parcelQuantity) {
                this.parcelQuantity = parcelQuantity;
            }

            public String getExpressType() {
                return expressType;
            }

            public void setExpressType(String expressType) {
                this.expressType = expressType;
            }

            public String getCargo() {
                return cargo;
            }

            public void setCargo(String cargo) {
                this.cargo = cargo;
            }

            public String getCargoCount() {
                return cargoCount;
            }

            public void setCargoCount(String cargoCount) {
                this.cargoCount = cargoCount;
            }

            public String getCargoTolWeight() {
                return cargoTolWeight;
            }

            public void setCargoTolWeight(String cargoTolWeight) {
                this.cargoTolWeight = cargoTolWeight;
            }

            public String getCargoWeight() {
                return cargoWeight;
            }

            public void setCargoWeight(String cargoWeight) {
                this.cargoWeight = cargoWeight;
            }

            public String getCargoAmount() {
                return cargoAmount;
            }

            public void setCargoAmount(String cargoAmount) {
                this.cargoAmount = cargoAmount;
            }

            public String getCargoUnit() {
                return cargoUnit;
            }

            public void setCargoUnit(String cargoUnit) {
                this.cargoUnit = cargoUnit;
            }

            public String getGoodsTotalWeight() {
                return goodsTotalWeight;
            }

            public void setGoodsTotalWeight(String goodsTotalWeight) {
                this.goodsTotalWeight = goodsTotalWeight;
            }

            public Object getIsDocall() {
                return isDocall;
            }

            public void setIsDocall(Object isDocall) {
                this.isDocall = isDocall;
            }

            public int getNeedReturnTrackingNo() {
                return needReturnTrackingNo;
            }

            public void setNeedReturnTrackingNo(int needReturnTrackingNo) {
                this.needReturnTrackingNo = needReturnTrackingNo;
            }

            public String getReturnTracking() {
                return returnTracking;
            }

            public void setReturnTracking(String returnTracking) {
                this.returnTracking = returnTracking;
            }

            public String getOrderName() {
                return orderName;
            }

            public void setOrderName(String orderName) {
                this.orderName = orderName;
            }

            public String getOrderCertType() {
                return orderCertType;
            }

            public void setOrderCertType(String orderCertType) {
                this.orderCertType = orderCertType;
            }

            public String getOrderCertNo() {
                return orderCertNo;
            }

            public void setOrderCertNo(String orderCertNo) {
                this.orderCertNo = orderCertNo;
            }

            public String getInsAmount() {
                return insAmount;
            }

            public void setInsAmount(String insAmount) {
                this.insAmount = insAmount;
            }

            public Object getIsGenbillNo() {
                return isGenbillNo;
            }

            public void setIsGenbillNo(Object isGenbillNo) {
                this.isGenbillNo = isGenbillNo;
            }

            public String getInsureFee() {
                return insureFee;
            }

            public void setInsureFee(String insureFee) {
                this.insureFee = insureFee;
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

            public String getJcityName() {
                return jcityName;
            }

            public void setJcityName(String jcityName) {
                this.jcityName = jcityName;
            }

            public String getJpostalCode() {
                return jpostalCode;
            }

            public void setJpostalCode(String jpostalCode) {
                this.jpostalCode = jpostalCode;
            }

            public String getDcountry() {
                return dcountry;
            }

            public void setDcountry(String dcountry) {
                this.dcountry = dcountry;
            }

            public String getJcountry() {
                return jcountry;
            }

            public void setJcountry(String jcountry) {
                this.jcountry = jcountry;
            }

            public String getJprovince() {
                return jprovince;
            }

            public void setJprovince(String jprovince) {
                this.jprovince = jprovince;
            }

            public String getJcounty() {
                return jcounty;
            }

            public void setJcounty(String jcounty) {
                this.jcounty = jcounty;
            }

            public String getJcompany() {
                return jcompany;
            }

            public void setJcompany(String jcompany) {
                this.jcompany = jcompany;
            }

            public String getDprovince() {
                return dprovince;
            }

            public void setDprovince(String dprovince) {
                this.dprovince = dprovince;
            }

            public String getDcityName() {
                return dcityName;
            }

            public void setDcityName(String dcityName) {
                this.dcityName = dcityName;
            }

            public String getDpostalCode() {
                return dpostalCode;
            }

            public void setDpostalCode(String dpostalCode) {
                this.dpostalCode = dpostalCode;
            }

            public String getJshippercode() {
                return jshippercode;
            }

            public void setJshippercode(String jshippercode) {
                this.jshippercode = jshippercode;
            }

            public String getDcompany() {
                return dcompany;
            }

            public void setDcompany(String dcompany) {
                this.dcompany = dcompany;
            }

            public String getDdeliverycode() {
                return ddeliverycode;
            }

            public void setDdeliverycode(String ddeliverycode) {
                this.ddeliverycode = ddeliverycode;
            }

            public String getDcounty() {
                return dcounty;
            }

            public void setDcounty(String dcounty) {
                this.dcounty = dcounty;
            }

            public List<OrderCargoListBean> getOrderCargoList() {
                return orderCargoList;
            }

            public void setOrderCargoList(List<OrderCargoListBean> orderCargoList) {
                this.orderCargoList = orderCargoList;
            }

            public static class OrderCargoListBean {
                /**
                 * cargo : 监控器材
                 * cargoCount :
                 * cargoTolWeight : null
                 * cargoWeight : null
                 * cargoAmount : null
                 * cargoUnit :
                 */

                private String cargo;
                private String cargoCount;
                private Object cargoTolWeight;
                private Object cargoWeight;
                private Object cargoAmount;
                private String cargoUnit;

                public String getCargo() {
                    return cargo;
                }

                public void setCargo(String cargo) {
                    this.cargo = cargo;
                }

                public String getCargoCount() {
                    return cargoCount;
                }

                public void setCargoCount(String cargoCount) {
                    this.cargoCount = cargoCount;
                }

                public Object getCargoTolWeight() {
                    return cargoTolWeight;
                }

                public void setCargoTolWeight(Object cargoTolWeight) {
                    this.cargoTolWeight = cargoTolWeight;
                }

                public Object getCargoWeight() {
                    return cargoWeight;
                }

                public void setCargoWeight(Object cargoWeight) {
                    this.cargoWeight = cargoWeight;
                }

                public Object getCargoAmount() {
                    return cargoAmount;
                }

                public void setCargoAmount(Object cargoAmount) {
                    this.cargoAmount = cargoAmount;
                }

                public String getCargoUnit() {
                    return cargoUnit;
                }

                public void setCargoUnit(String cargoUnit) {
                    this.cargoUnit = cargoUnit;
                }
            }
        }
    }
}
