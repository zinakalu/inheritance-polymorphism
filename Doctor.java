public class Doctor{
    boolean worksAtHospital;

    void treatPatient(){
        //perform a checkup
    }
}

public class FamilyDoctor extends Doctor{
    boolean makesHouseCalls; //adds one new insstance variable

    void giveAdvice(){
        //give homespun advice, adds a new method
    }
}

public class Surgeon extends Doctor{
    void treatPatient(){
        //perform surgery, overrides the inherited treatPatient() method
    }

    void makeIncision(){
        //makes inicision, adds a new method
    }
}

public void roam(){
    super.roam();
}