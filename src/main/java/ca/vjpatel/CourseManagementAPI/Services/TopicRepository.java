package ca.vjpatel.CourseManagementAPI.Services;

import ca.vjpatel.CourseManagementAPI.Models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {



}
