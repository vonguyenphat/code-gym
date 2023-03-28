package casestudy.services;

// dịch vụ khách hàng
public interface CustomerService extends Service {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
