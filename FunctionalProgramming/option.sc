def dailyCouponCode(): Option[String] = {
  // look up in database if we will provide our customers with a coupon today
   val couponFromDb = ""
   Option(couponFromDb).filter(_.nonEmpty)
  }
val todayCoupon: Option[String] = dailyCouponCode()
println(s"Today's coupon code = ${todayCoupon.getOrElse("No Coupon's Today")}")