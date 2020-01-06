package lectures.fakedata.generators;

import lectures.fakedata.enums.CreditCardType;
import lectures.fakedata.enums.EmailType;
import lectures.fakedata.enums.FreeDomainList;
import lectures.fakedata.utils.RandomUtils;

public class EmailGenerator {

    private FreeDomainList freeDomainList = FreeDomainList.values()[RandomUtils.randomNumber(FreeDomainList.values().length)];
    private String builder;

    public String generate(){
        return generate(EmailType.values()[RandomUtils.randomNumber(FreeDomainList.values().length)]);
    }

    public String generate(EmailType type) {
        switch (type) {
            case FIRST_LAST_NAME:
                builder = RandomUtils.getRandomPerson() + "@" + freeDomainList.getFreeDomain();
                break;
            case FIRST_NAME_NUMBER:
                builder = RandomUtils.getRandomLastName() + "" + RandomUtils.randomNumber(9999) + "@" + freeDomainList.getFreeDomain();
                break;
            case LAST_NAME_YEAR:
                builder = RandomUtils.getRandomFirstName() + "" + RandomUtils.randBetween(1900, RandomUtils.calculateCurrentYear()) + "@" + freeDomainList.getFreeDomain();
                break;
        }
        return builder;


    }


}
