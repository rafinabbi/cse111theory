package Practice;

public class GetterSetter {
    private String Name;
    private String Id;
    private String PhoneNo;

    public GetterSetter(String N,String I, String P){
        this.setName(N);
        this.getName();
        this.setId(I);
        this.getId();
        this.setPhoneNo(P);
        this.getPhoneNo();
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }


}
