package casestudy.services;

// dịch vụ đặt chổ
public interface BookingService extends Service {
    @Override
    void add();

    @Override
    void display();

    @Override
    void edit();
}
