package App.Application.Controllers;

import App.Domain.Campaign;
import App.Infrastructure.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {

    private final CampaignRepository campaignRepository;

    // Autowire the CampaignRepository into the controller
    @Autowired
    public CampaignController(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    // Endpoint to create a new Campaign
    @PostMapping
    public Campaign create(@RequestBody Campaign campaign) {
        return campaignRepository.create(campaign);
    }

    // Endpoint to retrieve a Campaign by its ID
    @GetMapping("/{campaignId}")
    public Campaign get(@PathVariable int campaignId) {
        Campaign campaign = campaignRepository.get(campaignId);
        if (campaign == null) {
            throw new RuntimeException("Campaign not found");
        }
        return campaign;
    }

    // Endpoint to retrieve all Campaigns
    @GetMapping
    public List<Campaign> getAll() {
        return campaignRepository.getAll();
    }

    // Endpoint to update an existing Campaign
    @PutMapping("/{campaignId}")
    public Campaign update(@PathVariable int campaignId, @RequestBody Campaign campaign) {
        int rowsAffected = campaignRepository.update(campaignId, campaign);
        if (rowsAffected == 0) {
            throw new RuntimeException("Campaign not found for update");
        }
        return campaign;
    }

    // Endpoint to delete a Campaign by its ID
    @DeleteMapping("/{campaignId}")
    public boolean delete(@PathVariable int campaignId) {
        boolean isDeleted = campaignRepository.delete(campaignId);
        if (!isDeleted) {
            throw new RuntimeException("Campaign not found for deletion");
        }
        return true;
    }
}
