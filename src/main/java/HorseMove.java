public class HorseMove {
    public boolean canHorseMove(int i, int j, int a, int b) // i,j - местоположение коня; a,b - цель
    {
        if ((a-i == 1 && b-j == 2) || (a-i == 2 && b-j == 1))
            return  true;
        else
            return false;
    }
}
