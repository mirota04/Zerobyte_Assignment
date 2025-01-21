package com.logistics.transfer.controller;

import com.logistics.transfer.dto.TransferRequest;
import com.logistics.transfer.dto.TransferResponse;
import com.logistics.transfer.service.TransferService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/calculate-route")
    public TransferResponse calculateRoute(@RequestBody TransferRequest request) {
        return transferService.calculateBestTransfers(request.getMaxWeight(), request.getAvailableTransfers());
    }
}
