public enum EnumTest {
    EMP(0,"人员","EMP");
    private int type;
    private String name ;
    private String metaType;
    private EnumTest(int type,String name,String metaType){
        this.type=type;
        this.name=name;
        this.metaType=metaType;
    }
    public void Go(){
        System.out.println(type+" : "+name+" : "+metaType);
    }

}
