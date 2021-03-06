package ohtu.justinbiber.service;

import java.util.List;
import ohtu.justinbiber.domain.Entry;
/**
 * An interface for controlling the entries.
 *
 */
public interface BibService {
        /**
     * Returns a list of the added entries.
     * @return
     */
    public List<Entry> getEntries();
        /**
     * Adds an entry to the list of entries.
     * @param entry
     */
    public void addEntry(Entry entry);

    /**
     * Returns all entries that have certain key (ie. "authors")
     * @param srchkey
     * @return
     */
    public List<Entry> findEntriesByKey(String srchkey);

    public void initialize(BibInitializer<BibServiceManager> initializer);

}
