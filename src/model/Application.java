package model;

import enumerations.*;

import java.math.BigInteger;
import java.util.GregorianCalendar;

public class Application {

    private String applicationIden;
    private GregorianCalendar applicationDate;
    private BigInteger bankIden;
    private String branchIden;
    private char customerType;
    private String customerId;
    private String parentCustomer;
    private ParentRelationships customerParentRelation;
    private String promoter;
    private String firstName;
    private GregorianCalendar middleName;
    private String lastName;
    private GregorianCalendar birthDate;
    private String birthLocation;
    private IdentityType firstIdentityType;
    private String firstIdentity;
    private IdentityType secondIdentityType;
    private String secondIdentity;
    private Gender firstGender;
    private String nationality;
    private int NumOfDependents;
    private int positionOrTitle;

    private AddressType firstAddressType;
    private String firstAddressLine1;
    private String firstAddressLine2;
    private String firstAddressLine3;
    private int firstAddressZipCode;
    private String firstAddressPhone1;
    private String firstAddressPhone2;
    private String firstAddressFax;
    private String firstCity;

    private AddressType SecondAddressType;
    private String SecondAddressLine1;
    private String SecondAddressLine2;
    private String SecondAddressLine3;
    private int SecondAddressZipCode;
    private String SecondAddressPhone1;
    private String SecondAddressPhone2;
    private String SecondAddressFax;
    private String secondCity;

    private AddressType thirdAddressType;
    private String thirdAddressLine1;
    private String thirdAddressLine2;
    private String thirdAddressLine3;
    private int thirdAddressZipCode;
    private String thirdAddressPhone1;
    private String thirdAddressPhone2;
    private String thirdAddressFax;
    private String thirdCity;

    private char accountType;
    private String mxpAccount;
    private String bankAccount;
    private String accountCurrency;
    private String debitProgramId;
    private double creditLimit;
    private String guaranteeType;
    private double guaranteeValue;
    private String guaranteeInfo;

    private Title cardHolderTitle;
    private String cardHolderFirstName;
    private String cardHolderMiddleName;
    private String cardHolderLastName;
    private String nameOnCard;
    private String corporateName;
    private String cardProgramId;
    private char automaticOrManualCardNumber;
    private GregorianCalendar effectiveDate;
    private char primaryOrSecondary;

    private String primaryCard;
    private char newCardDesign;
    private String cardDesignFee;
    private char expressDelivery;
    private String deliveryOperator;
    private String expressDeliveryFee;
    private String cardPersonalisationFee;
    private String corespondenceType;
    private char clientType;


}
