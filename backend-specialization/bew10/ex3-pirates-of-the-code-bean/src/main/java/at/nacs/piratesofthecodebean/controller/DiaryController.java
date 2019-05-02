package at.nacs.piratesofthecodebean.controller;

import at.nacs.piratesofthecodebean.model.Diary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/remove")
@RequiredArgsConstructor
public class DiaryController {

    private final Diary diary;

    @PostMapping
    public String removeCurse() {
        diary.setDecipher(true);
        return "redirect:/diary";
    }
}
