public class HorseMove {
    public boolean canHorseMove(int i, int j, int a, int b) // i,j - местоположение коня; a,b - цель
    {
        if (i <= 8 || j <= 8 || a <= 8 || b <= 8) {
            if ((a - i == 1 && b - j == 2) || (a - i == 2 && b - j == 1))
                return true;
            else
                return false;
        } else return false;
    }
}
