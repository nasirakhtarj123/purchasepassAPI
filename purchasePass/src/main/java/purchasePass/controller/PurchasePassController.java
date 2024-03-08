package purchasePass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import purchasePass.dto.PurchasePassRequestDto;
import purchasePass.dto.PurchasePassResponseDto;
import purchasePass.service.PurchasePassService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PurchasePassController {

    @Autowired
    private PurchasePassService purchasePassService;

    @GetMapping("/purchase/{id}")
    public ResponseEntity<PurchasePassResponseDto> getPurchasePass(@PathVariable("id") Long id) {
        // Call the service layer to retrieve purchase pass by ID
        PurchasePassResponseDto responseDto = purchasePassService.getPurchasePassById(id);

        // Check if purchase pass is found
        if (responseDto != null) {
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/purchase/{id}")
    public ResponseEntity<PurchasePassResponseDto> updatePurchasePass(
            @PathVariable("id") Long id,
            @RequestBody PurchasePassRequestDto requestDto) {
        // Call the service layer to update purchase pass
        PurchasePassResponseDto responseDto = purchasePassService.updatePurchasePass(id, requestDto);

        // Check if purchase pass is updated successfully
        if (responseDto != null) {
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/purchase/{id}")
    public ResponseEntity<Void> deletePurchasePass(@PathVariable("id") Long id) {
        // Call the service layer to delete purchase pass
        boolean deleted = purchasePassService.deletePurchasePass(id);

        // Check if purchase pass is deleted successfully
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/purchase")
    public ResponseEntity<Object> purchasePass(@RequestBody List<PurchasePassRequestDto> requestDtoList) {
        // Call the service layer and get the response
        PurchasePassResponseDto responseDto = purchasePassService.purchasePass(requestDtoList);

        // Check if the response is successful or not
        if (responseDto != null) {
            return ResponseEntity.ok().body(Map.of("Message", "ok"));
        } else {
            return ResponseEntity.badRequest().body(Map.of("Message", "return the error message"));
        }
    }
}
