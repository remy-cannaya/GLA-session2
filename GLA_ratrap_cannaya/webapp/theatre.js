
function getServerData(type,url,success){
	$.ajax({
		type:type,
		dataType:'json',
		url:url
	}).done(success);

}
function getServerDataText(type,url,success){
	$.ajax({
		type:type,
		dataType:'text',
		url:url
	}).done(success);
}

function callName(theatrename){
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute":JSON.stringify(theatrename)
	});

	$("#theatre").append(html);
}


function callCity(City){
	var templateExample = _.template($('#templateCity').html());
	var html = templateExample({
		"city":JSON.stringify(City)
	});

	$("#City").html(html);
}


function callMovies(Movielist){
	for (var i = 0; i<Movielist.length; i++) {
		var templateExample = _.template($('#templateMovie').html());
		var html = templateExample({
			"Movie":JSON.stringify(Movielist[i].movielist)
		});

		$("#movielist").append(html);
	}
}

function callShows(Showlist){
	for (var i = 0; i<Showlist.length; i++) {
		var templateExample = _.template($('#templateShow').html());
		var html = templateExample({
			"Show":JSON.stringify(Movielist[i].showlist)
		});

		$("#showlist").append(html);
	}
}


function callSetTheatrename(name){
	var name = $('input[name="setName"]').val();
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute":JSON.stringify(name)
	});
	$('#name').html(html);
}	

function callSetCity(city){
	var mail = $('input[city="setCity"]').val();
	var templateExample = _.template($('#templateCity').html());
	var html = templateExample({
		"attribute":JSON.stringify(city)
	});
	$('#city').html(html);
}	

function callLogMovie(Movie){
	var templateExample = _.template($('#templateLog').html());
	var html = templateExample({
		"MovieID":JSON.stringify($('input[name="MovieID"]').val())
	});

	$("#logMovie").html(html);
	
}

function callLogShow(Show){
	var templateExample = _.template($('#templateLog').html());
	var html = templateExample({
		"ShowID":JSON.stringify($('input[name="ShowID"]').val())
	});

	$("#logShow").html(html);
	
}

function callDeleteMovies(Movies){
	var templateExample = _.template($('#templateDelete').html());
	var html = templateExample({
		"MovieId":JSON.stringify($('input[name="MovieID"]').val())
	});

	$("#logMovie").html(html);
	
}

function callDeleteShow(Show){
	var templateExample = _.template($('#templateDelete').html());
	var html = templateExample({
		"ShowID":JSON.stringify($('input[name="ShowID"]').val())
	});

	$("#logShow").html(html);
	
}



$(function (){
		
				
		var userid ='1';
		var theatreid ='1';

		getServerDataText('GET','/ws/User/'+userid+'/Theatre/'+theatreid+'/getName',callName);
		getServerDataText('GET','/ws/User/'+userid+'/Theatre/'+theatreid+'/getCity',callCity);
		getServerData('GET','/ws/User/'+userid+'/Theatre/'+theatreid+'/getMovies',callMovies);
		getServerData('GET','/ws/User/'+userid+'/Theatre/'+theatreid+'/getShows',callShows);
				
		$('#SetTheatreName').click(function(){
			var input = $('input[name="setName"]').val();
			getServerData('POST','/ws/User/'+userid+'/Theatre/'+theatreid+'/setName',callsetTheatreName);
		});
		
		$('#SetTheatreCity').click(function(){
			var input = $('input[city="setcity"]').val();
			getServerData('POST','/ws/User/'+userid+'/Theatre/'+theatreid+'/setCity',callsetCity);
		});
		
		
		$('#AddMovie').click(function(){
			getServerData('PUT','ws/User/'+userid+'/Theatre/'+theatreid+'/addMovie',callLogMovie);
		});
		
		$('#AddShow').click(function(){
			getServerData('PUT','ws/User/'+userid+'/Theatre/'+theatreid+'/addShow',callLogShow);
		});
		
		
		$('#DeleteMovie').click(function(){
			getServerData('DELETE','ws/User/'+userid+'/Theatre/'+theatreid+'/removeMovie',callDeleteMovie);
		});
		
		$('#DeleteShow').click(function(){
			getServerData('DELETE','ws/User/'+userid+'/Theatre/'+theatreid+'/removeShow',callDeleteShow);
		});
		

});

	

