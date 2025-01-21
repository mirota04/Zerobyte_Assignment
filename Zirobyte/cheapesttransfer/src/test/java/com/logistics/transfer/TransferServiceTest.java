package com.logistics.transfer;

import com.logistics.transfer.model.Transfer;
import com.logistics.transfer.service.TransferService;
import com.logistics.transfer.dto.TransferResponse;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TransferServiceTest {
    @Test
    void testCalculateBestTransfers() {
        TransferService service = new TransferService();
        TransferResponse response = service.calculateBestTransfers(15, Arrays.asList(
            new Transfer(5, 10),
            new Transfer(10, 20),
            new Transfer(3, 5),
            new Transfer(8, 15)
        ));

        assertEquals(30, response.getTotalCost());
        assertEquals(15, response.getTotalWeight());
    }
}
