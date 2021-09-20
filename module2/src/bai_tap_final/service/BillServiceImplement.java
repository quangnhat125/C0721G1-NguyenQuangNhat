package bai_tap_final.service;

public class BillServiceImplement implements BillService {
    @Override
    public void edit() {

    }

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }
//    //bill code tự tăng:MHD-001, MHD-002,MHD -003
//    private String getBillCode(String path){
//        String billCode="";
//        List<Bill> billList = ReadElectricFile.getBillList(BILL_PATH);
//        List<String> billCodeList = new LinkedList<>();
//        for(Bill bill : billList){
//            billCodeList.add(bill.getBillCode());
//        }
//        List<Integer> integerList = new ArrayList<>();
//        for(String string:billCodeList) {
//            String[] array = string.split("-");
//            integerList.add(Integer.valueOf(array[1]));
//        }
//        Collections.sort(integerList);
//        if(integerList.get(integerList.size()-1)>98){
//            billCode= billCode+"-"+(integerList.get(integerList.size()-1)+1);
//        }
//        if(integerList.get(integerList.size()-1)>8){
//            billCode=billCode+"-0"+(integerList.get(integerList.size()-1)+1);
//        }
//        if(integerList.get(integerList.size()-1)>0){
//            billCode= billCode+"-00"+(integerList.get(integerList.size()-1)+1);
//        }
//        return billCode;
//    }
}
