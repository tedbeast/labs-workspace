package Lab.Service;

import Lab.Application;
import Lab.Model.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a component, which makes it a potential Bean. When Spring Boot undergoes its initial Component Scan,
 * this class will be turned into a bean which may be injected into other classes, such as the NotebookController.
 *
 * TODO: TimeService hasn't been labelled a Component yet, so it can't be injected into the Constructor as a Bean!
 * You will need to add the @Component annotation to TimeService.
 */
@Component
public class NotebookService {
    List<Entry> entries;
    TimeService timeService;
    /**
     * Using the @Autowired annotation and Constructor Injection, the most appropriate bean will be injected into this
     * class from the Spring IOC container, which contains all the beans. IOC stands for inversion-of-control -
     * Spring is controlling the instantiation of Objects, rather than the developer.
     *
     * The @Autowired annotation could also be placed above the timeService field (field injection) or a timeService
     * setter (setter injection).
     * @param timeService
     */
    @Autowired
    public NotebookService(TimeService timeService){
        this.timeService = timeService;
        entries = new ArrayList<>();
        Application.log.info("NotebookService: Just instantiated a new NotebookService! Dependency injection for the win");
    }
    /**
     * @return all entries from the list of notebook entries
     */
    public List<Entry> getEntries(){
        Application.log.info("NotebookService: Getting all entries: "+entries);
        return entries;
    }
    /**
     * Add a new entry, but also leverage the TimeService to obtain the current time and date.
     * @param entry an Entry object
     * @return the added entry
     */
    public Entry addEntry(Entry entry){
        entry.setTime(timeService.getCurrentTime());
        entries.add(entry);
        Application.log.info("NotebookService: Added a new entry: "+entry);
        return entry;
    }
    /**
     * Get an entry by its entryNumber
     * @param entryNumber the index of the entry in the entrylist
     * @return entry of id entryNumber
     */
    public Entry getEntriesById(int entryNumber) {
        Entry entry = entries.get(entryNumber);
        Application.log.info("NotebookService: Getting an entry by id: "+entryNumber+" which is "+entry);
        return entry;
    }

}
