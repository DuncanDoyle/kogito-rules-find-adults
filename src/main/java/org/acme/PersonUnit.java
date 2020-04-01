package org.acme;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

/**
 * PersonUnitData
 */
public class PersonUnit implements RuleUnitData {

    private int adultAge;

    DataStore<Person> persons;

    public PersonUnit() {
        persons = DataSource.createStore();
    }

    public PersonUnit(DataStore<Person> persons) {
        this.persons = persons;
    }


    public int getAdultAge() {
        return adultAge;
    }

    public void setAdultAge(int adultAge) {
        this.adultAge = adultAge;
    }

    public DataStore<Person> getPersons() {
        return persons;
    }

    public void setPersons(DataStore<Person> persons) {
        this.persons = persons;
    }
    
}