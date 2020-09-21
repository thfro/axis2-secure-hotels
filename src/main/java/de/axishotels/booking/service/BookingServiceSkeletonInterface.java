/**
 * BookingServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.axishotels.booking.service;


/**
 *  BookingServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface BookingServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getHotelsRequest
     */
    public de.axishotels.booking.types.GetHotelsResponse getHotels(
        de.axishotels.booking.types.GetHotelsRequest getHotelsRequest);

    /**
     * Auto generated method signature
     *
     * @param createReservationRequest
     */
    public de.axishotels.booking.types.CreateReservationResponse createReservation(
        de.axishotels.booking.types.CreateReservationRequest createReservationRequest);
}
