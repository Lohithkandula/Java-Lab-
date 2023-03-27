public class population
{
public static void main(String[] args)
{
double cp = 312032486;
double birth = 7.0;
double death = 13.0;
double immigration = 45.0;
double birthsPerYear = (60 * 60 * 24 * 365) / birth;
double deathsPerYear = (60 * 60 * 24 * 365) / death;
double immigrationPerYear = (60 * 60 * 24 * 365) / immigration;
for (int i = 1; i <= 5; i++)
{
cp += birthsPerYear - deathsPerYear + immigrationPerYear;
System.out.printf("population in year " + i + " = %1.0f\n",cp);
}
}
}
