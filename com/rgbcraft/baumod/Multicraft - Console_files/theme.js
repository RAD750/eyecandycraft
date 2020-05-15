$(document).ready(function() {
    $('.hint').popover({
        trigger: 'hover',
        delay: {show: 100, hide: 500},
        html: true,
        placement: 'left',
        container: 'body'
    });                              
});
