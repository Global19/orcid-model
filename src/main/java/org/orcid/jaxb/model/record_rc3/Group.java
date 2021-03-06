package org.orcid.jaxb.model.record_rc3;

import java.util.Collection;

import org.orcid.jaxb.model.common_rc3.LastModifiedDate;

/**
 * 
 * @author Will Simpson
 *
 */
public interface Group {

    Collection<? extends GroupableActivity> getActivities();

    void setLastModifiedDate(LastModifiedDate lastModifiedDate);
    
    LastModifiedDate getLastModifiedDate();
}
