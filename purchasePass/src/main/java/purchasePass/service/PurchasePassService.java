package purchasePass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import purchasePass.dto.PurchasePassRequestDto;
import purchasePass.dto.PurchasePassResponseDto;
import purchasePass.entity.PurchasePass;
import purchasePass.repository.PurchasePassRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PurchasePassService {

    @Autowired
    private PurchasePassRepository purchasePassRepository;

    public PurchasePassResponseDto purchasePass(List<PurchasePassRequestDto> requestDtoList) {
        List<PurchasePass> storedPasses = new ArrayList<>();
        for (PurchasePassRequestDto requestDto : requestDtoList) {
            PurchasePass purchasePass = new PurchasePass();
            // Populate PurchasePass entity with data from PurchasePassRequestDto
            purchasePass.setUserID(requestDto.getUserID());
            purchasePass.setFareID(requestDto.getFareID());
            purchasePass.setFareName(requestDto.getPassName());
            purchasePass.setAmount(requestDto.getFare());
            purchasePass.setQuantity(requestDto.getQuantity());
            purchasePass.setGuestsCount(requestDto.getGuests());
            purchasePass.setCategory(requestDto.getCategory());
            purchasePass.setVehicleNumber(requestDto.getVehicleNumber());
            purchasePass.setVehicleModel(requestDto.getVehicleModel());
            purchasePass.setLicenseNumber(requestDto.getLicenseNumber());
            purchasePass.setPurchasedDate(LocalDateTime.now());

            storedPasses.add(purchasePass);
        }

        List<PurchasePass> savedPasses = purchasePassRepository.saveAll(storedPasses);

        PurchasePassResponseDto responseDto = new PurchasePassResponseDto();
        responseDto.addStoredPasses(savedPasses);
        return responseDto;
    }

    public PurchasePassResponseDto getPurchasePassById(Long id) {
        Optional<PurchasePass> optionalPurchasePass = purchasePassRepository.findById(id);
        PurchasePassResponseDto responseDto = new PurchasePassResponseDto();
        optionalPurchasePass.ifPresent(purchasePass -> responseDto.addStoredPass(purchasePass));
        return responseDto;
    }

    public PurchasePassResponseDto updatePurchasePass(Long id, PurchasePassRequestDto requestDto) {
        Optional<PurchasePass> optionalPurchasePass = purchasePassRepository.findById(id);
        if (optionalPurchasePass.isPresent()) {
            PurchasePass purchasePass = optionalPurchasePass.get();
            // Update PurchasePass entity with data from PurchasePassRequestDto
            purchasePass.setUserID(requestDto.getUserID());
            purchasePass.setFareID(requestDto.getFareID());
            purchasePass.setFareName(requestDto.getPassName());
            purchasePass.setAmount(requestDto.getFare());
            purchasePass.setQuantity(requestDto.getQuantity());
            purchasePass.setGuestsCount(requestDto.getGuests());
            purchasePass.setCategory(requestDto.getCategory());
            purchasePass.setVehicleNumber(requestDto.getVehicleNumber());
            purchasePass.setVehicleModel(requestDto.getVehicleModel());
            purchasePass.setLicenseNumber(requestDto.getLicenseNumber());
            purchasePass.setPurchasedDate(LocalDateTime.now());

            PurchasePass updatedPurchasePass = purchasePassRepository.save(purchasePass);
            PurchasePassResponseDto responseDto = new PurchasePassResponseDto();
            responseDto.addStoredPass(updatedPurchasePass);
            return responseDto;
        } else {
            PurchasePassResponseDto responseDto = new PurchasePassResponseDto();
            responseDto.setMessage("Purchase pass with id " + id + " not found.");
            return responseDto;
        }
    }

    public boolean deletePurchasePass(Long id) {
        if (purchasePassRepository.existsById(id)) {
            purchasePassRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
