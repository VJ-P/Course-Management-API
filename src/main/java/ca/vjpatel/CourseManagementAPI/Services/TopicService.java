package ca.vjpatel.CourseManagementAPI.Services;

import ca.vjpatel.CourseManagementAPI.Models.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    List<Topic> topics = Arrays.asList(
            new Topic("SFWRENG 3K04", "Software Development", "Software design process. Professional responsibility. Using specifications. Documentation. Module Specification. Module interfaces. Module internal documentation. Coding styles. Portability. Software inspection. Software testing."),
            new Topic("COMPENG 3DQ5", "Digital Systems Design", "Advanced design methods of digital systems including modelling, simulation, synthesis and verification using hardware description languages, timing analysis and hardware debugging; implementation of computer peripherals in programmable devices."),
            new Topic("COMPENG 3DR4", "Computer Organization", "Instruction set design, computer arithmetic, assembly language, controller and datapath design, cache and memory systems, input-output systems, networks interrupts and exceptions, pipelining, performance and cost analysis, computer architecture history and a survey of advanced architectures.")
        );

    public List<Topic> getAllTopics() {
        return topics;
    }
}