package oop;

/**
 * Combination Lock
 * The correct (opening) combination code must be set when constructing the ComboLock.
 * The correct sequence of digits making up the code must be entered in order
 * to open the ComboLock.
 * When entering a code, the first digit must be entered by
 * turning Right (clockwise), then Left, and finally Right.
 */

public class ComboLock {

    // Instance variables (fields)
    // Code combination required to open this lock
    private int digit1;
    private int digit2;
    private int digit3;
    private LockStateEnum state;

    public ComboLock(int digit1, int digit2, int digit3)
    {
        this.digit1 = digit1;
        this.digit2 = digit2;
        this.digit3 = digit3;
        this.state = LockStateEnum.NONE_CORRECT;
    }

    public int getDigit1()
    {
        return this.digit1;
    }

    public void setDigit1(int digit1)
    {
        this.digit1 = digit1;
    }

    public int getDigit2()
    {
        return this.digit2;
    }

    public void setDigit2(int digit2)
    {
        this.digit2 = digit2;
    }

    public int getDigit3()
    {
        return this.digit3;
    }

    public void setDigit3(int digit3)
    {
        this.digit3 = digit3;
    }


//    ------------------------------

    public void reset()
    {
        this.state = LockStateEnum.NONE_CORRECT;
    }

    public void turnRight(int number) {

        if(number > 0 && number < 40)
        {
            if(this.state == LockStateEnum.NONE_CORRECT && number == digit1)
            {
                this.state = LockStateEnum.FIRST_CORRECT;
            }
            if (this.state == LockStateEnum.SECOND_CORRECT && digit3 == number)
            {
                this.state = LockStateEnum.THIRD_CORRECT;
            }
        }
        else {
            System.out.println("Not a valid number");
        }

    }

    public void turnLeft(int number) {
        if(number > 0 && number < 40)
        {
            if (this.state == LockStateEnum.FIRST_CORRECT && digit2 == number)
            {
                this.state = LockStateEnum.SECOND_CORRECT;
            }
        }
        else {
            System.out.println("Not a valid number");
        }
    }

    public boolean open() {
        return this.state == LockStateEnum.THIRD_CORRECT;
    }

    //TODO
    // Consider - can a user open this lock by entering the right sequence of
    // codes but with some incorrect ones in between the correct ones.
    // How might this be resolved?
}
