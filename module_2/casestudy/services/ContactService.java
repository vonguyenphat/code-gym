package casestudy.services;

// liên hệ với dịch vụ
public interface ContactService extends Service {
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
