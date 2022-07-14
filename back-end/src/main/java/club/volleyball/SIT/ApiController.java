package club.volleyball.SIT;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api")
public class ApiController {
    @RequestMapping(value = "")
    @ResponseBody
    BirthStone getBirthStone(){
        BirthStone birthStone = new BirthStone();
        birthStone.setMonth("2月");
        birthStone.setName("アメジスト");
        birthStone.setColor("紫");
        return birthStone;
    }
}
