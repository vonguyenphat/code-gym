package codegym.vn.model;

public class Customer {
   private int pageSize;
   private boolean spamsFiller;
   private String signature;

    public Customer() {
    }

    public Customer(int pageSize, boolean spamsFiller, String signature) {
        this.pageSize = pageSize;
        this.spamsFiller = spamsFiller;
        this.signature = signature;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFiller() {
        return spamsFiller;
    }

    public void setSpamsFiller(boolean spamsFiller) {
        this.spamsFiller = spamsFiller;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
