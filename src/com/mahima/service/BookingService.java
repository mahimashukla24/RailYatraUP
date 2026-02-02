package com.mahima.service;

import java.util.List;

import com.mahima.beans.HistoryBean;
import com.mahima.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
