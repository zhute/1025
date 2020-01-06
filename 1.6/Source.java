package bankersAlgorithm;
public class Source {
    private String sName;//资源名称
    public int sNum;//资源种类个数
    public Source(String sName,int sNum) {
        this.sName = sName;
        this.sNum=sNum;
    }

    public String getsName() {
        return sName;
    }

    public int getsNum() {
        return sNum;
    }
}
