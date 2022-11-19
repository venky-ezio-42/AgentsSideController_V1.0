package com.venkyezio42.Agents.controller;

import com.venkyezio42.Agents.Attacker;
import com.venkyezio42.Agents.Defender;
import com.venkyezio42.Agents.iSide;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@RestController
@RequestMapping("/side")
@RequiredArgsConstructor
public class SideController {

    /*
    String type;

    public void input (HttpServletRequest req)
    {
        this.type = req.getParameter("name");
        System.out.print(type);
    }

    @Qualifier("attacker")
    @Autowired


    private iSide side;
    private Attacker attacc;
    private Defender def;
*/
    @GetMapping
    public String onSide(HttpServletRequest req)
    {

        iSide side;
        Attacker attacc;
        Defender def;


        String type = req.getParameter("name");

        if(Objects.equals(type, "attacker"))
        {
            attacc = new Attacker();
            type = attacc.mission();
        }

        else if(Objects.equals(type, "defender"))
        {
            def = new Defender();
            type = def.mission();
        }

        else
        {
            type = "Proceedng as Spectator";
        }

//        System.out.println(type);

        return type;
    }
}
