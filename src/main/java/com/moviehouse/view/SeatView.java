package main.java.com.moviehouse.view;

import main.java.com.moviehouse.service.SeatService;
import main.java.com.moviehouse.model.Seat;

import java.io.IOException;
import java.util.List;

public class SeatView {
    private SeatService seatService = new SeatService();

    public static final String ACTIONS_SEAT = "Введите действие:\n" +
            "1.Поиск места\n" +
            "2.Освободить все занятые места в зале\n" +
            "3.Показать все места\n";

    public List<Seat> getSearchSeat(String search) throws IOException {
        return seatService.getSearchSeat(search);
    }

    public void emptySeat() throws IOException {
        seatService.getEmptySeats();
    }

    public List<Seat> getAllSeat() throws IOException {
        return seatService.getAllSeat();
    }
}
