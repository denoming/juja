package in.ua.denoming.juja;

/**
 * User: DENIS
 * Data: 18.02.2017
 * Time: 12:20
 */
public interface ArrayRecorder<T extends Comparable<T>> extends Array<T> {
    void startRecord();
    void stopRecord();
    Statistic getStatistic();
}
