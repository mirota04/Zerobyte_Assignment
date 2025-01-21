package com.logistics.transfer.service;

import com.logistics.transfer.model.Transfer;
import com.logistics.transfer.dto.TransferResponse;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransferService {
    public TransferResponse calculateBestTransfers(int maxWeight, List<Transfer> transfers) {
        int n = transfers.size();
        int[][] dp = new int[n + 1][maxWeight + 1];

        for (int i = 1; i <= n; i++) {
            Transfer t = transfers.get(i - 1);
            for (int w = 0; w <= maxWeight; w++) {
                if (t.getWeight() <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - t.getWeight()] + t.getCost());
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<Transfer> selectedTransfers = new ArrayList<>();
        int w = maxWeight, totalCost = dp[n][maxWeight];

        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                Transfer t = transfers.get(i - 1);
                selectedTransfers.add(t);
                w -= t.getWeight();
            }
        }

        return new TransferResponse(selectedTransfers, totalCost, maxWeight - w);
    }
}
