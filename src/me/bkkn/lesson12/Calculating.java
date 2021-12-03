package me.bkkn.lesson12;

public interface Calculating extends Dividing{

    private void calc(float[]arr){
        for (int i = 0; i <arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5.f) * Math.cos(0.2f + i / 5.f) * Math.cos(0.4f + i / 2.f));
    }

    default float[] calculate(float[] arr) {
        long start = System.currentTimeMillis();
        calc(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Single thread calculation task took " +(finish - start) +" milliseconds"  );
        return arr;
    }

    default float[] calculateParallel(float[] arr) {
        long start = System.currentTimeMillis();
        final float[][] arrs = divide(arr);
        long divided = System.currentTimeMillis();
        new Thread( () -> calc(arrs[0])).start();
        new Thread( () -> calc(arrs[1])).start();
        long merged = System.currentTimeMillis();
        arr = merge(arrs[0], arrs[1]);
        long finish = System.currentTimeMillis();
        System.out.println("Multi  thread calculation task took " +(finish - start) +" milliseconds"  );
        System.out.println("(divided in " +(divided - start) +" milliseconds)"  );
        System.out.println("(merged in " +(finish - merged) +" milliseconds)"  );
        System.out.println("(calc in " +((finish - start) - (finish - merged) - (divided - start) ) +" milliseconds)"  );
        System.out.println("too small calc time to be true)");
        return arr;
    }
}
