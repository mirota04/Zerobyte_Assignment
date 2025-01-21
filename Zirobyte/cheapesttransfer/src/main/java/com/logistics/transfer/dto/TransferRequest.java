package com.logistics.transfer.dto;

import com.logistics.transfer.model.Transfer;
import java.util.List;

public class TransferRequest {
    private int maxWeight;
    private List<Transfer> availableTransfers;

    // Add setters for Jackson to use during deserialization
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setAvailableTransfers(List<Transfer> availableTransfers) {
        this.availableTransfers = availableTransfers;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public List<Transfer> getAvailableTransfers() {
        return availableTransfers;
    }
}
