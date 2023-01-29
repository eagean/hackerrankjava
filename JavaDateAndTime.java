

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
      SimpleDateFormat df = new SimpleDateFormat("EEEE");
        Calendar a = Calendar.getInstance();
        System.out.println(df.format(a.getTime()));
        a.set(year, month-1, day);
         System.out.println(df.format(a.getTime()));
        return df.format(a.getTime()).toUpperCase();

    }

}
