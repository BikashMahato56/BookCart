$(function() {
	switch (menu) {
	
	case 'All Products':
		$('#product').addClass('active');
		break;
	default:
		$('#product').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
	
});