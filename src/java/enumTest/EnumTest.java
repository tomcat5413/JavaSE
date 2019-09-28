package enumTest;

public enum EnumTest {
        ONE(0,"待审核"),
        TWO(1,"审核通过");
        
        int statu;
        String desc;

   
    EnumTest(int statu, String desc) {
        this.statu = statu;
        this.desc = desc;
    }
    public static EnumTest getEnumTest(int status){
        for (EnumTest a:values()) {
            if (status==a.statu){
                return a;
            }
        }
        return null;
    }
    public static String getDesc(int status){
        for (EnumTest a:values()) {
            if (status==a.statu){
                return a.getDesc();
            }
        }
        return null;
    }
    public String getDesc() {
        return desc;
    }

    public int getStatu() {
        return statu;
    }
}
