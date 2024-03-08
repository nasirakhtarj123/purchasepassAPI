package purchasePass.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "jettypark_tickets")
public class PurchasePass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userID;
    private Integer fareID;
    private String fareName;
    private Double amount;
    private Integer quantity;
    private Integer guestsCount;
    private Integer ticketID;
    private Boolean isActivated;
    private Boolean isValidated;
    private Integer ticketStatus;
    private LocalDateTime expiryDate;
    private LocalDateTime activatedDate;
    private LocalDateTime validatedDate;
    private String category;
    private String vehicleNumber;
    private String vehicleModel;
    private String licenseNumber;
    private LocalDateTime purchasedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Integer getFareID() {
        return fareID;
    }

    public void setFareID(Integer fareID) {
        this.fareID = fareID;
    }

    public String getFareName() {
        return fareName;
    }

    public void setFareName(String fareName) {
        this.fareName = fareName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getGuestsCount() {
        return guestsCount;
    }

    public void setGuestsCount(Integer guestsCount) {
        this.guestsCount = guestsCount;
    }

    public Integer getTicketID() {
        return ticketID;
    }

    public void setTicketID(Integer ticketID) {
        this.ticketID = ticketID;
    }

    public Boolean getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }

    public Boolean getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Boolean isValidated) {
        this.isValidated = isValidated;
    }

    public Integer getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(LocalDateTime activatedDate) {
        this.activatedDate = activatedDate;
    }

    public LocalDateTime getValidatedDate() {
        return validatedDate;
    }

    public void setValidatedDate(LocalDateTime validatedDate) {
        this.validatedDate = validatedDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public LocalDateTime getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(LocalDateTime purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public PurchasePass(Long id, Long userID, Integer fareID, String fareName, Double amount, Integer quantity,
            Integer guestsCount, Integer ticketID, Boolean isActivated, Boolean isValidated, Integer ticketStatus,
            LocalDateTime expiryDate, LocalDateTime activatedDate, LocalDateTime validatedDate, String category,
            String vehicleNumber, String vehicleModel, String licenseNumber, LocalDateTime purchasedDate) {
        this.id = id;
        this.userID = userID;
        this.fareID = fareID;
        this.fareName = fareName;
        this.amount = amount;
        this.quantity = quantity;
        this.guestsCount = guestsCount;
        this.ticketID = ticketID;
        this.isActivated = isActivated;
        this.isValidated = isValidated;
        this.ticketStatus = ticketStatus;
        this.expiryDate = expiryDate;
        this.activatedDate = activatedDate;
        this.validatedDate = validatedDate;
        this.category = category;
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.licenseNumber = licenseNumber;
        this.purchasedDate = purchasedDate;
    }

    public PurchasePass() {

    }

    // Constructors, getters, and setters
}
