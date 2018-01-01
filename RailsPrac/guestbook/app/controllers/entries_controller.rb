class EntriesController < ApplicationController
	def sign_in
	#Obviously, there is a co-relation between visitor_name 
	#sign_in html, and here; it is appearant that user's
	#input is being fetched to here.
	
	#One could wonder how did Rails convert the given URL into a call sign_in method?
	#Check the comments in routes.rb.
		@name = params[:visitor_name]
		if !@name.blank? then	
			@entry = Entry.create({:name => @name})	
		end
		
		@entries = Entry.all
	end
end
