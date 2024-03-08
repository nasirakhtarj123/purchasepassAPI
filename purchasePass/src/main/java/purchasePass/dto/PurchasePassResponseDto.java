package purchasePass.dto;

import purchasePass.entity.PurchasePass;

import java.util.ArrayList;
import java.util.List;

public class PurchasePassResponseDto {

    private String message;
    private List<PurchasePass> storedPasses;

    // Constructor
    public PurchasePassResponseDto() {
        this.storedPasses = new ArrayList<>();
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getter and Setter for storedPasses
    public List<PurchasePass> getStoredPasses() {
        return storedPasses;
    }

    public void setStoredPasses(List<PurchasePass> storedPasses) {
        this.storedPasses = storedPasses;
    }

    // Add a single storedPass to the list
    public void addStoredPass(PurchasePass storedPass) {
        this.storedPasses.add(storedPass);
    }

    // Add a list of storedPasses
    public void addStoredPasses(List<PurchasePass> storedPasses) {
        this.storedPasses.addAll(storedPasses);
    }
}
