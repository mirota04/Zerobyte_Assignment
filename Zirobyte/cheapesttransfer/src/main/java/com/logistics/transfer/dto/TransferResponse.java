package com.logistics.transfer.dto;

import com.logistics.transfer.model.Transfer;
import java.util.List;

public class TransferResponse {
    private List<Transfer> selectedTransfers;
    private int totalCost;
    private int totalWeight;

    public TransferResponse(List<Transfer> selectedTransfers, int totalCost, int totalWeight) {
        this.selectedTransfers = selectedTransfers;
        this.totalCost = totalCost;
        this.totalWeight = totalWeight;
    }

    public List<Transfer> getSelectedTransfers() {
        return selectedTransfers;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
