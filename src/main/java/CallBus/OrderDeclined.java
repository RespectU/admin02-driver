package CallBus;

public class OrderDeclined extends AbstractEvent {

    private Long driverId;
    private String status;
    private Long orderId;

    public OrderDeclined(){
        super();
    }

    public Long getDriverId() {
        return driverId;
    }
    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

}