package ru.oop.task1;

/**
 * Объект, который может ехать
 */
public interface Drivable {

    /**
     * Едем до конечной точки, если мы можем добраться до неё
     *
     * @param position - Куда мы должны доехать
     * @return - точка, до которой удалось доехать
     */
    Position drive(Position position);
}
