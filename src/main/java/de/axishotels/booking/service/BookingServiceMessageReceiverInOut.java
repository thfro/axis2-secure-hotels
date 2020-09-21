/**
 * BookingServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package de.axishotels.booking.service;


/**
 *  BookingServiceMessageReceiverInOut message receiver
 */
public class BookingServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            BookingServiceSkeletonInterface skel = (BookingServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getHotels".equals(methodName)) {
                    de.axishotels.booking.types.GetHotelsResponse getHotelsResponse13 =
                        null;
                    de.axishotels.booking.types.GetHotelsRequest wrappedParam = (de.axishotels.booking.types.GetHotelsRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                                .getBody()
                                                                                                                                                .getFirstElement(),
                            de.axishotels.booking.types.GetHotelsRequest.class);

                    getHotelsResponse13 = skel.getHotels(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getHotelsResponse13, false,
                            new javax.xml.namespace.QName(
                                "http://axishotels.de/booking/types",
                                "GetHotelsResponse"));
                } else if ("createReservation".equals(methodName)) {
                    de.axishotels.booking.types.CreateReservationResponse createReservationResponse15 =
                        null;
                    de.axishotels.booking.types.CreateReservationRequest wrappedParam =
                        (de.axishotels.booking.types.CreateReservationRequest) fromOM(msgContext.getEnvelope()
                                                                                                .getBody()
                                                                                                .getFirstElement(),
                            de.axishotels.booking.types.CreateReservationRequest.class);

                    createReservationResponse15 = skel.createReservation(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            createReservationResponse15, false,
                            new javax.xml.namespace.QName(
                                "http://axishotels.de/booking/types",
                                "CreateReservationResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        de.axishotels.booking.types.GetHotelsRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(de.axishotels.booking.types.GetHotelsRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        de.axishotels.booking.types.GetHotelsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(de.axishotels.booking.types.GetHotelsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        de.axishotels.booking.types.CreateReservationRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(de.axishotels.booking.types.CreateReservationRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        de.axishotels.booking.types.CreateReservationResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(de.axishotels.booking.types.CreateReservationResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        de.axishotels.booking.types.GetHotelsResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    de.axishotels.booking.types.GetHotelsResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private de.axishotels.booking.types.GetHotelsResponse wrapGetHotels() {
        de.axishotels.booking.types.GetHotelsResponse wrappedElement = new de.axishotels.booking.types.GetHotelsResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        de.axishotels.booking.types.CreateReservationResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    de.axishotels.booking.types.CreateReservationResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private de.axishotels.booking.types.CreateReservationResponse wrapCreateReservation() {
        de.axishotels.booking.types.CreateReservationResponse wrappedElement = new de.axishotels.booking.types.CreateReservationResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (de.axishotels.booking.types.CreateReservationRequest.class.equals(
                        type)) {
                return de.axishotels.booking.types.CreateReservationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (de.axishotels.booking.types.CreateReservationResponse.class.equals(
                        type)) {
                return de.axishotels.booking.types.CreateReservationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (de.axishotels.booking.types.GetHotelsRequest.class.equals(type)) {
                return de.axishotels.booking.types.GetHotelsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (de.axishotels.booking.types.GetHotelsResponse.class.equals(type)) {
                return de.axishotels.booking.types.GetHotelsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
