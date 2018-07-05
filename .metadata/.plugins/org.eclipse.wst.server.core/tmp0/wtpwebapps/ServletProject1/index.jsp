<%@page import="com.enlume.Servlet.connection"%>
<%@ page import="java.sql.*, com.enlume.Servlet.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>ela website</title>

    <!-- Bootstrap -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="bootstrap/css/style.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
    <%
    connection db = new connection();
    
    Connection con = db.getConnection();
    %>
  
  <div class="container-fluid">
  <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">ELA Application</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Services</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">More<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Sell on ELA</a></li>
            <li><a href="#">24x7 CustomerCare Support</a></li>
            <li><a href="#">Advertize</a></li>
            <li class="divider"></li>
            <li><a href="#">Registered Office Address</a></li>
            <li class="divider"></li>
            <li><a href="#">Press</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Registration.html">Your Cart</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Join us <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="Registration.html">Register</a></li>
            <li><a href="Login.html">Login</a></li>
            <li><a href="#">Today's Deals</a></li>
            <li class="divider"></li>
            <li><a href="#">Your Account Info</a></li>
          </ul>
        </li>
      </ul>
      </div>
      </div>
      </nav>
       <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Wrapper for slides -->
        <div class="carousel-inner">
         <div class="item active">
                <img src="images/img2.jpg">
            </div>
            <!-- End Item -->
            <div class="item">
                <img src="images/abc1.jpg">
        
            </div>
            <!-- End Item -->
            <div class="item">
                <img src="images/abc.jpg">
            </div>
            <!-- End Item -->
        </div>
        <!-- End Carousel Inner -->
        <ul id="myCarousel" class="nav nav-pills nav-justified">
            <li data-target="#myCarousel" data-slide-to="0" class="active"><a href="#">About<small>ELA Application</small></a></li>
            <li data-target="#myCarousel" data-slide-to="1"><a href="#">Careers<small>ELA Application</small></a></li>
            <li data-target="#myCarousel" data-slide-to="2"><a href="#">Mail us<small>ELA Application</small></a></li>
            <li data-target="#myCarousel" data-slide-to="3"><a href="#">Offers<small>ELA Application</small></a></li>
        </ul>
        <hr />
    <div class="row">
      <div class="col-sm-4 col-md-3">
        <h3>Categories</h3>
        <div class="list-group">
          <a href="Apparels.jsp" class="list-group-item">Apparel & Accessories</a>
          <a href="category.html" class="list-group-item">Baby Products</a>
          <a href="Electronics.jsp" class="list-group-item">Electronics</a>
          <a href="Furniture.jsp" class="list-group-item">Furniture</a>
          <a href="category.html" class="list-group-item">Luggage & Bags</a>
          <a href="category.html" class="list-group-item">Shoes</a>
          <a href="category.html" class="list-group-item">Watches</a>
        </div>
      </div>
      <div class="col-sm-8 col-md-9">
        <div class="row">
       <%
 		
 		try {
 			Statement st = db.getStatement();
 			
 			ResultSet rs = st.executeQuery("SELECT * FROM products");
 			
 			while(rs.next()) {
 		%>	
 
		 <div class="col-sm-6 col-md-4">
		 <div class="thumbnail">
		 <img src="<%=rs.getString("image") %>" alt="">
		 <div class="add-to-cart">
		 <a href="#" class="glyphicon glyphicon-plus-sign"
		data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
		 </div>
		 <div class="caption">
		 <h4 class="pull-right"><%=rs.getDouble("price") %></h4>
		 <h4><a href="product.html"><%=rs.getString("prodName") %></a>
		 </h4>
		 <p><%=rs.getString("description") %></p>
		 <div class="ratings">
		 <p class="pull-right"><a href="product.
		html#comments"><%=rs.getInt("reviewCount") %> reviews</a></p>
		 <p>
		 <%for(int i = 1; i <= rs.getInt("stars"); i++) { %>
		 <span class="glyphicon glyphicon-star"></span>
		 <%} %>
		 </p>
		 </div>
		 </div>
		 </div>
		 </div> 
		 
		 
		 <%
		 
 			}
 			
 		} catch(Exception e) {
 			e.printStackTrace();
 		}
		 %>
       
    <!--  
       <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$19.99</h4>
                <h4><a href="product.html">1<sup>st</sup>Product</a>
                </h4>
                <p>Natural Creation Wayfarer Sunglasses(Clear)</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.html#comments">10 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div> 
       <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod2.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$102.99</h4>
                <h4><a href="product.html">2<sup>st</sup> Product</a>
                </h4>
                <p>Nikon AFDX 75mm f/4.5-5.6G ED VR Lens</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">17 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div> 
       
       <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod3.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$504.99</h4>
                <h4><a href="product.html">3<sup>st</sup> Product</a>
                </h4>
                <p>One Plus 6 Star Wars Last Jedi Edition(Space grey Color)</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">8 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div> 
       
       <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod4.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$34.99</h4>
                <h4><a href="product.html">4<sup>st</sup> Product</a>
                </h4>
                <p>Nike Men's Emerge 3 Running Shoes(New Edition)</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">10 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div> 
       
    <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod5.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$204.99</h4>
                <h4><a href="product.html">5<sup>st</sup> Product</a>
                </h4>
                <p>Perfect Homes by DamroCapri Engineered Wood 6Seater</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">24 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div> 
       
       <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod6.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$40.99</h4>
                <h4><a href="product.html">6<sup>st</sup> Product</a>
                </h4>
                <p>Lino Perros Women's Handbag (Red) WaterResistence</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div> 
       
            <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod7.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$10.99</h4>
                <h4><a href="product.html">7<sup>st</sup> Product</a>
                </h4>
                <p>Tommy Hilfiger womens's dress (pink shade) New one</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div>
               <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod8.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$40.99</h4>
                <h4><a href="product.html">8<sup>st</sup> Product</a>
                </h4>
                <p>Cuuran Perros men's wrist watch (silver) WaterResistence</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div>
               <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod9.JPG" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$10.99</h4>
                <h4><a href="product.html">9<sup>st</sup> Product</a>
                </h4>
                <p>Veirdo Cotton shirt for Men and elastic(Blue shade)</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div>
          
               <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod13.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$60.99</h4>
                <h4><a href="product.html">10<sup>st</sup> Product</a>
                </h4>
                <p>Stream Star Live Production Studio kit exclusive for tv</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div>
          
               <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod11.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$20.99</h4>
                <h4><a href="product.html">11<sup>st</sup> Product</a>
                </h4>
                <p>fire fox 7x3 bicycle for men (latest edition)</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div>
          
               <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
              <img src="images/prod12.jpg" alt="">
              <div class="add-to-cart">
                <a href="#" class="glyphicon glyphicon-plus-sign" 
data-toggle="tooltip" data-placement="top" title="Add to cart"></a>
              </div>
              <div class="caption">
                <h4 class="pull-right">$30.99</h4>
                <h4><a href="product.html">12<sup>st</sup> Product</a>
                </h4>
                <p>Aesop hayal Deodrant and perfume for men(highly inflammable)</p>
                <div class="ratings">
                  <p class="pull-right"><a href="product.
html#comments">4 reviews</a></p>
                  <p>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                    <span class="glyphicon glyphicon-star"></span>
                  </p>
                </div>
              </div>
            </div>
          </div>
          
          -->
        </div>
 </div>
    </div>
    
    
  </div>
    </div>
    
    
    
       <div class="container">
    <hr />
    <!-- Footer -->
    <footer>
      <div class="row">
        <div class="col-lg-12">
          <p>Copyright &copy; <a href="ecommerce.html">Ecommerce Website</a> 2018</p>
        </div>
      </div>
    </footer>
  </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js">
$(document).ready( function() {
    $('#myCarousel').carousel({
		interval:   4000
	});
	
	var clickEvent = false;
	$('#myCarousel').on('click', '.nav a', function() {
			clickEvent = true;
			$('.nav li').removeClass('active');
			$(this).parent().addClass('active');		
	}).on('slid.bs.carousel', function(e) {
		if(!clickEvent) {
			var count = $('.nav').children().length -1;
			var current = $('.nav li.active');
			current.removeClass('active').next().addClass('active');
			var id = parseInt(current.data('slide-to'));
			if(count == id) {
				$('.nav li').first().addClass('active');	
			}
		}
		clickEvent = false;
	});
});
  </script>
  </body>
</html>
