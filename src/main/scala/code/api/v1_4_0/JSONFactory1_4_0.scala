package code.api.v1_4_0

import java.util.Date

import code.customerinfo.CustomerInfo

object JSONFactory1_4_0 {

  case class CustomerInfoJson(customer_number : String,
                              legal_name : String,
                              mobile_phone_number : String,
                              email : String,
                              face_image : CustomerFaceImageJson)

  case class CustomerFaceImageJson(url : String, date : Date)

  def createCustomerInfoJson(cInfo : CustomerInfo) : CustomerInfoJson = {

    CustomerInfoJson(customer_number = cInfo.number,
      legal_name = cInfo.legalName, mobile_phone_number = cInfo.mobileNumber,
      email = cInfo.email, face_image = CustomerFaceImageJson(url = cInfo.faceImage.url, date = cInfo.faceImage.date))

  }


}