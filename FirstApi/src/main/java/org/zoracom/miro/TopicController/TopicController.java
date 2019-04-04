package org.zoracom.miro.TopicController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic ("Spring", "Spring Framework", "Spring Description"),
                new Topic ("Java", "Java Framework", "Java Description"),
                new Topic ("Oracle", "Oracle Framework", "Oracle Description")
        );
    }
}
